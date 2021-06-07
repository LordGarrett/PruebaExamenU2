package mx.tecnm.nlaredo.pruebaexamenu2

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    val titles = arrayOf("PC Delios",
    "PC Delios 10",
    "PC Delios 60z",
    "PC Delios 30h",
    "PC Gladius 60z",
    "PC Gladius 60i")
    val details = arrayOf("$20,000.00",
        "$18,500.00",
        "$25,000.00",
        "$22,000.00",
            "$26,000.00",
            "$21,550.00")
    val images = arrayOf(R.drawable.pc1,
        R.drawable.pc2,
        R.drawable.pc3,
        R.drawable.pc4,
    R.drawable.pc5,
    R.drawable.pc1)

    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle:TextView
        var itemDetails:TextView

        init{
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetails = itemView.findViewById(R.id.item_detalles)
        }

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.cardview_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetails.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])
    }
   override fun getItemCount():Int{
       return titles.size
   }
}