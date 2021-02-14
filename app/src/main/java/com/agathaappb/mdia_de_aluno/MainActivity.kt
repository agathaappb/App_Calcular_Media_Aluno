package com.agathaappb.mdia_de_aluno

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = b_calcula
        val resultado = result
        val color_img = img_android


        b_calcula.setOnClickListener{
            //Vou pegar o texto do input do usuário e transformar para um numero inteiro
            val nota1 = n1.text.toString().toFloat()
            val nota2 = n2.text.toString().toFloat()
            val media = ((nota1+nota2)/2)
            val falta = Integer.parseInt(faltas.text.toString())

            if(media >= 6.0 && falta <=10){
                resultado.setText("Aluno(a) foi aprovado! \n Nota final: $media \n Número de faltas: $falta ")
                resultado.setTextColor(Color.GREEN)
                color_img.setColorFilter(Color.GREEN)
            }
            else {
                resultado.setText("Aluno(a) foi reprovado! \n Nota Final: $media \n Número de faltas: $falta ")
                resultado.setTextColor(Color.RED)
                img_android.setColorFilter(Color.RED)
            }
        }

    }
}