package com.example.compras.ui.acitivies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.compras.R
import com.example.compras.models.Produto
import com.example.compras.ui.components.ListaProdutoAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listaProdutoView = findViewById<RecyclerView>(R.id.lista_produtos)
        val listaProdutos = listOf(
            Produto ("Refrigerante", "Coca-cola", BigDecimal(7.80)),
            Produto("Papel Higiênico", "marca Fofo", BigDecimal(18.80)),
            Produto("Arroz","Camil, 10 kg", BigDecimal(12))
        )
        listaProdutoView.adapter = ListaProdutoAdapter(listaProdutos, this)
        listaProdutoView.layoutManager = LinearLayoutManager(this)

    }
}