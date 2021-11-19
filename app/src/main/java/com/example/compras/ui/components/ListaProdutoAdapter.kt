package com.example.compras.ui.components

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.compras.R
import com.example.compras.models.Produto

class ListaProdutoAdapter(
    private val produtos: List<Produto>,
    private val context: Context
): RecyclerView.Adapter<ListaProdutoAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        fun vincular(produtos: Produto){
            val produtoTitulo = itemView.findViewById<TextView>(R.id.textNomeProduto)
            produtoTitulo.text = produtos.nome

            val produtoDescricao = itemView.findViewById<TextView>(R.id.textDescricaoProduto)
            produtoDescricao.text = produtos.descricao

            val produtoPreco = itemView.findViewById<TextView>(R.id.text_preco)
            produtoPreco.text = (produtos.preco).toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_lista, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tarefas = produtos[position]
        holder.vincular(tarefas)
    }

    override fun getItemCount(): Int = produtos.size
}