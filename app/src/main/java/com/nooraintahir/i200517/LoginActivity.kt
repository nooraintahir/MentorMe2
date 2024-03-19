package com.nooraintahir.i200517

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    private lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginbtn = findViewById<Button>(R.id.login)
        mAuth = FirebaseAuth.getInstance()
        val email = findViewById<TextView>(R.id.email)
        var  pass = findViewById<TextView>(R.id.pass)

        loginbtn.setOnClickListener {
            var emailTxt = email.text.toString()
            var passTxt = pass.text.toString()


            //if password field is empty
            if(emailTxt.isEmpty()) {
                email.error= "Please enter email"
                email.requestFocus()
                return@setOnClickListener
            }
            if(passTxt.isEmpty()) {
                pass.error= "Please enter password"
                pass.requestFocus()
                return@setOnClickListener
            }
            signin(emailTxt,passTxt)

        }

   }
    fun signup(view: android.view.View) {
        val intent = Intent(this, SignupActivity::class.java)
        startActivity(intent)
    }
    fun forgotpass(view: android.view.View) {
        val intent = Intent(this, ForgotPassActivity::class.java)
        startActivity(intent)
    }
    private fun signin(email:String, pass:String){
        mAuth.signInWithEmailAndPassword(email, pass)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("TAG", "signInWithEmail:success")
                    val user = mAuth.currentUser

                    /* var secondActivityIntent = Intent(this, SecondActivity::class.java)
                     startActivity(secondActivityIntent)*/
                    startActivity(Intent(this, HomeActivity::class.java))
                    finish()

                } else {
                    // If sign in fails, display a message to the user.
                    Log.w("TAG", "signInWithEmail:failure", task.exception)
                    Toast.makeText(this,"User name or Password is incorrect", Toast.LENGTH_SHORT).show()

                }
            }
    }
}