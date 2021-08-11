package uz.smd.marketplatform.ui.catalogs

/**
 * Created by Siddikov Mukhriddin on 1/4/21
 */
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.smd.marketplatform.R
import uz.smd.marketplatform.utils.bindItem
import uz.smd.marketplatform.utils.inflate


class CatalogsItemAdapter : RecyclerView.Adapter<CatalogsItemAdapter.ViewHolder>() {
    var listener: ((Catalogs) -> Unit)? = null

    private var tasksDay: MutableList<Catalogs> = mutableListOf()
    fun setListenerGetPos(block: (Catalogs) -> Unit) {
        listener = block
    }

    fun setTasksDay(tasksDay: List<Catalogs>) {
        this.tasksDay.clear()
        this.tasksDay.addAll(tasksDay)
        notifyDataSetChanged()
    }
    fun opnMouth(){

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(parent.inflate(R.layout.item_catalogs_item))

    override fun getItemCount() = tasksDay.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind()
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        private val title: TextView = itemView.textUseAreas
//        private val imagePopular: ImageView = itemView.img_popular_program_one_list
//        private val viewUseAreas: LinearLayout = itemView.viewUseArea
        fun bind() = bindItem {
            val d = tasksDay[adapterPosition]
//            title.setText(d.title)
//            imagePopular.setImageResource(d.image)
//            viewUseAreas.setOnClickListener { listener?.invoke(d) }
        }


    }

}