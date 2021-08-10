package uz.smd.marketplatform.ui.catalogs

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*
import uz.smd.marketplatform.R

/**
 * Created by Siddikov Mukhriddin on 2/10/21
 */
@AndroidEntryPoint
class CatalogsFragment : Fragment(R.layout.fragment_category) {
    private val viewModel: CatalogsViewModel by viewModels()
val adapterUser=CatalogsAdapter()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleLiveData()
        listPrograms.adapter=adapterUser
        adapterUser.setTasksDay(listUserData())
    }

    fun handleLiveData() {
//        viewModel.k.observe(this, Observer {
////            Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
//        })
    }

    fun listUserData(): List<CatalogsList> {

        val listCatalogs = ArrayList<CatalogsList>()
        for (i in 0..10){
            val listUseAreas = ArrayList<Catalogs>()
            listUseAreas.add(Catalogs( "Kitoblar", R.drawable.img_book,"Kitoblar"))
            listUseAreas.add(Catalogs( "Badiy Adabiyotlar", R.drawable.img_book,"Kitoblar"))
            listUseAreas.add(Catalogs("Biznes", R.drawable.img_book,"Kitoblar"))
            listUseAreas.add(Catalogs("Psixologiya", R.drawable.img_book,"Kitoblar"))
            listCatalogs.add(CatalogsList(listUseAreas,"Kitoblar"))
        }



        return listCatalogs
    }
}