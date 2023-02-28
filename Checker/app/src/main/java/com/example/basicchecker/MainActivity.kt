package com.example.basicchecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.ImageView

enum class team{
    RED,
    BLUE
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun getPiece(imageView: ImageView,team: team){
            imageView.setOnClickListener{
                println("$imageView was clicked")
            }
            }


        val red1 = getPiece(findViewById(R.id.red1),team.RED)
        val red2 = getPiece(findViewById(R.id.red2),team.RED)
        val red3 = getPiece(findViewById(R.id.red3),team.RED)
        val red4 = getPiece(findViewById(R.id.red4),team.RED)
        val red5 = getPiece(findViewById(R.id.red5),team.RED)
        val red6 = getPiece(findViewById(R.id.red6),team.RED)
        val red7 = getPiece(findViewById(R.id.red7),team.RED)
        val red8 = getPiece(findViewById(R.id.red8),team.RED)
        val red9 = getPiece(findViewById(R.id.red9),team.RED)
        val red10 = getPiece(findViewById(R.id.red10),team.RED)
        val red11 = getPiece(findViewById(R.id.red11),team.RED)
        val red12 = getPiece(findViewById(R.id.red12),team.RED)

        val blue1 = getPiece(findViewById(R.id.blue1),team.BLUE)
        val blue2 = getPiece(findViewById(R.id.blue2),team.BLUE)
        val blue3 = getPiece(findViewById(R.id.blue3),team.BLUE)
        val blue4 = getPiece(findViewById(R.id.blue4),team.BLUE)
        val blue5 = getPiece(findViewById(R.id.blue5),team.BLUE)
        val blue6 = getPiece(findViewById(R.id.blue6),team.BLUE)
        val blue7 = getPiece(findViewById(R.id.blue7),team.BLUE)
        val blue8 = getPiece(findViewById(R.id.blue8),team.BLUE)
        val blue9 = getPiece(findViewById(R.id.blue9),team.BLUE)
        val blue10 = getPiece(findViewById(R.id.blue10),team.BLUE)
        val blue11 = getPiece(findViewById(R.id.blue11),team.BLUE)
        val blue12 = getPiece(findViewById(R.id.blue12),team.BLUE)
    }

}