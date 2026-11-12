package com.example.roomsiswa9.repositori

import android.content.Context
import com.example.roomsiswa9.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context): ContainerApp{
    override val repositoriSiswa: RepositoriSiswa by lazy {
        offlineRepositoriSiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}