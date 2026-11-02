package com.clockworklabs.spacetimedb

import com.clockworklabs.spacetimedb.bsatn.BsatnWriter

class ReducerHandle(private val connection: DbConnection) {

    suspend fun call(reducerName: String, args: ByteArray = ByteArray(0)): ReducerResult {
        return connection.callReducer(reducerName, args)
    }

    suspend fun call(reducerName: String, writeArgs: (BsatnWriter) -> Unit): ReducerResult {
        val writer = BsatnWriter()
        writeArgs(writer)
        return connection.callReducer(reducerName, writer.toByteArray())
    }
}
