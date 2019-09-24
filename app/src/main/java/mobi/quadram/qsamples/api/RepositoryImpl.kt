package mobi.quadram.qsamples.api

import android.content.Context
import android.content.Context.MODE_PRIVATE

class RepositoryImpl(context: Context): Repository {

    private val sharedPRefs = context.getSharedPreferences("SHARED_PREFERENCES", MODE_PRIVATE)

    override fun getData(): String {
        return sharedPRefs.getString("DEMO", "No hay nada") ?: "No hay nada"
    }

    override fun setData(str: String) {
        sharedPRefs.edit().putString("DEMO", str).apply()
    }

}