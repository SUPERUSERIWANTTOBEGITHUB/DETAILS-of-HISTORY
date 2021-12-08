package yvg68.measurer.crc9_20211201
//
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val brendTextView: TextView = itemView.findViewById(R.id.brend_text_view)
    private val carView: ImageView = itemView.findViewById(R.id.car_view)

    fun bind(car: Car){
        brendTextView.text = car.brend
    carView.setImageResource(car.image)
    }
}