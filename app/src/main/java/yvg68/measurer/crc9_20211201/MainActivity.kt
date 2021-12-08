package yvg68.measurer.crc9_20211201

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    lateinit var carRecyclerView: RecyclerView
    //val carList: List<Car>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        carRecyclerView = findViewById(R.id.car_view)
        val carList: List<Car> = listOf(
            Car("bugatty_veyron", R.drawable.bugatty_veyron),
            Car("maseraty", R.drawable.maseraty),
            Car("audi_gray", R.drawable.audi_gray),
            Car("audi_red", R.drawable.audi_red),
            Car("audi_black", R.drawable.audi_black)
        )
        carRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        carRecyclerView.adapter = CarAdapter(carList)
    }
}