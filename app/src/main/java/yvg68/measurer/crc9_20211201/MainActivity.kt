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
            Car("red_car", R.drawable.red_car)
        )
        carRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        carRecyclerView.adapter = CarAdapter(carList)
    }
}