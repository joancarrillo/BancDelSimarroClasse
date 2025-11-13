package es.carrillo.bancdelsimarro

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class LoginActivity : AppCompatActivity() {



    private val FAKE_USER_JSON = """
        { "id": 1, "nif": "111", "nombre": "Ana (JSON)", "password": "1234" }
    """
    private val FAKE_USER_SERIALIZABLE = """
        { "id": 2, "nif": "222", "nombre": "Juan (Serializable)", "password": "1234" }
    """
    private val FAKE_USER_PARCELABLE = """
        { "id": 3, "nif": "333", "nombre": "Sara (Parcelable)", "password": "1234" }
    """

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()






    }
}