package ps.code.hot_potato

import android.app.Application
import ps.code.hot_potato.di.initKoin

class HotPotatoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}