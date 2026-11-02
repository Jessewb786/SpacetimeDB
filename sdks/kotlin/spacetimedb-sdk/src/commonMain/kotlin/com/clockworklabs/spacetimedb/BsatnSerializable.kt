package com.clockworklabs.spacetimedb

import com.clockworklabs.spacetimedb.bsatn.BsatnReader
import com.clockworklabs.spacetimedb.bsatn.BsatnWriter

interface BsatnSerializable<T> {
    fun serialize(writer: BsatnWriter)
    fun deserialize(reader: BsatnReader): T
    fun encode(): ByteArray
}
