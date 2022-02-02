package uz.smd.marketplatform.ui.catalogs

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*
import uz.smd.marketplatform.R
import java.util.concurrent.Executors

/**
 * Created by Siddikov Mukhriddin on 2/10/21
 */
@AndroidEntryPoint
class CatalogsFragment : Fragment(R.layout.fragment_category) {
//    private val viewModel: CatalogsViewModel by viewModels()
val adapterUser=CatalogsAdapter()
    val data= MutableLiveData<List<CatalogsList>>()
    init {
        data.postValue(listUserData())
        data.observe(this, Observer {
            adapterUser.setTasksDay(it)
        })
    }
    @SuppressLint("FragmentLiveDataObserve")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listPrograms.adapter=adapterUser



    }



    fun listUserData(): List<CatalogsList> {

        val listCatalogs = ArrayList<CatalogsList>()
        for (i in 0..6){
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