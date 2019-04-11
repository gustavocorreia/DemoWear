package com.example.logonrmlocal.demowear

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.models.Carro
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.wearable.Node
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),
        CarroListAdapter.Callback,
        GoogleApiClient.ConnectionCallbacks{

    private lateinit var client: GoogleApiClient
    private var connectedNode: List<Node>? = null

    override fun onConnected(p0: Bundle?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onConnectionSuspended(p0: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



    override fun carroClicked(carro: Carro) {

    }

    private var adapter: CarroListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carros = CarroRepository.buscarTodos(this)
        adapter = CarroListAdapter(carros, this)
        lista.adapter = adapter
        lista.layoutManager = LinearLayoutManager(this)
    }
}

