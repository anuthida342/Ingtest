package th.ac.su.anuthida.ingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    val db = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var putName = findViewById<EditText>(R.id.putName)
        var putId = findViewById<EditText>(R.id.putId)
        var putTel = findViewById<EditText>(R.id.putTel)
        var press = findViewById<Button>(R.id.press)
        var reName = findViewById<TextView>(R.id.reName)
        var reId = findViewById<TextView>(R.id.reId)
        var reTel = findViewById<TextView>(R.id.reTel)

        val myfriendCollection = db.collection("MyFriend")

        val data1: MutableMap<String, Any> = HashMap()


        press.setOnClickListener {
            data1["name"] = putName.getText().toString()
            data1["id"] = putId.getText().toString()
            data1["tel"] = putTel.getText().toString()

            myfriendCollection.document("putId.getText().toString()").set(data1)

            myfriendCollection.document(putId.getText().toString()).set(data1)

            reName.text = "Name : " + (putName.getText().toString())
            reId.text = "Id : " + (putId.getText().toString())
            reTel.text = "Tel : " + (putTel.getText().toString())

        }
    }
}
