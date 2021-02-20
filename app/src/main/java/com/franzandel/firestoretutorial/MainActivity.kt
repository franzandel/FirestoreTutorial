package com.franzandel.firestoretutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*

const val TAG = "ASDF"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Firebase.firestore
        btnAdd.setOnClickListener {
            // Create a new user with a first and last name
            val user = hashMapOf(
                "first" to "Ada",
                "last" to "Lovelace",
                "born" to 1815
            )

            // Add a new document with a generated ID
            db.collection("users2")
                .add(user)
                .addOnSuccessListener { documentReference ->
                    Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference.id}")
                }
                .addOnFailureListener { e ->
                    Log.d(TAG, "Error adding document", e)
                }
        }

        btnGet.setOnClickListener {
            db.collection("users2")
                .get()
                .addOnSuccessListener { result ->
                    for (document in result) {
                        Log.d(TAG, "${document.id} => ${document.data}")
                        val user = document.data.toDataClass<User>()
                        Log.d(TAG, user.firsta)
                    }
                }
                .addOnFailureListener { exception ->
                    Log.w(TAG, "Error getting documents.", exception)
                }
        }
    }
}