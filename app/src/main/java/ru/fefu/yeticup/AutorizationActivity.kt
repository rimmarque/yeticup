package ru.fefu.yeticup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import ru.fefu.yeticup.databinding.ActivityMainBinding

class AutorizationActivity : AppCompatActivity() {

    private lateinit var phoneEditText: TextInputEditText
    private lateinit var passwordEditText: TextInputEditText
    private lateinit var submitButton: Button
    private lateinit var userSubmitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autorization)

        phoneEditText = findViewById(R.id.phoneEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        submitButton = findViewById(R.id.submitButton)
        userSubmitButton = findViewById(R.id.userSubmitButton)

        submitButton.setOnClickListener {
            val phone = phoneEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (phone.isEmpty()) {
                phoneEditText.error = "Неправильный логин"
                return@setOnClickListener
            } else if (password.isEmpty()) {
                passwordEditText.error = "Неправильный ключ"
                return@setOnClickListener
            } else {
                submitButton.setOnClickListener(){
                    val intent = Intent(this, AdminActivity::class.java)
                    startActivity(intent)
                }
            }
        }

        userSubmitButton.setOnClickListener {
            val phone = phoneEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (phone.isEmpty()) {
                phoneEditText.error = "Неправильный логин"
                return@setOnClickListener
            } else if (password.isEmpty()) {
                passwordEditText.error = "Неправильный ключ"
                return@setOnClickListener
            } else {
                userSubmitButton.setOnClickListener(){
                    val intent = Intent(this, UserActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}