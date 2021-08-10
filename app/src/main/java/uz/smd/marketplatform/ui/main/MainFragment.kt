package uz.smd.marketplatform.ui.main

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
@SuppressLint("FragmentLiveDataObserve")
@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {
    private val viewModel: MainViewModel by viewModels()
val adapter=ListUseAreasAdapter()
val adapterUser=ListUserAdapter()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleLiveData()
        listUseAreas.adapter=adapter
        listPrograms.adapter=adapterUser
        adapter.setListenerGetPos {  }
        adapter.setTasksDay(listUseAreas())
        adapterUser.setTasksDay(listUserData())
    }

    fun handleLiveData() {
//        viewModel.k.observe(this, Observer {
////            Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
//        })
    }
    fun listUseAreas(): List<UseArea> {
        val listUseAreas = ArrayList<UseArea>()
        listUseAreas.add(UseArea(1, R.string.text_glaza, R.drawable.icn_stat))
        listUseAreas.add(UseArea(2, R.string.text_location, R.drawable.icn_location))
        listUseAreas.add(UseArea(3, R.string.text_online, R.drawable.icn_home))
        listUseAreas.add(UseArea(4, R.string.text_states, R.drawable.icn_states))
//    listUseAreas.add(UseArea(8, R.string.text_popular_programs.toString(), R.drawable.icn_popular_stars.toString()))
        return listUseAreas
    }
    fun listUserData(): List<UserData> {
        val listUseAreas = ArrayList<UserData>()
        listUseAreas.add(UserData(1, "Matematika", "Siddiqov Muxriddin","Matematikadan 10 yillik tajriba 1000 ortiq muvaffaqiyatli bitirgan talabalar. Darslar istalgan shaklda olib boriladi (onlayn, offlayn) ,haftaning qulay paytidagi guruxlarga qushilish imkoniyati",3,"Toshkent"))
        listUseAreas.add(UserData(2, "Matematika", "Naimova Nilufar","Matematikadan 5 yillik tajriba 500 ortiq muvaffaqiyatli bitirgan talabalar. Darslar istalgan shaklda olib boriladi (onlayn, offlayn) ,haftaning qulay paytidagi guruxlarga qushilish imkoniyati",3,"Toshkent"))
        listUseAreas.add(UserData(3, "Fizika", "Xojiev Akbar","Fizikadan 15 yillik tajriba 1000 ortiq muvaffaqiyatli bitirgan talabalar. Darslar istalgan shaklda olib boriladi (onlayn, offlayn) ,haftaning qulay paytidagi guruxlarga qushilish imkoniyati",3,"Toshkent"))
        listUseAreas.add(UserData(4, "Oliy matematika", "Oripov Akram","Matematikadan 10 yillik tajriba 1000 ortiq muvaffaqiyatli bitirgan talabalar. Darslar istalgan shaklda olib boriladi (onlayn, offlayn) ,haftaning qulay paytidagi guruxlarga qushilish imkoniyati",3,"Toshkent"))

//    listUseAreas.add(UseArea(8, R.string.text_popular_programs.toString(), R.drawable.icn_popular_stars.toString()))
        return listUseAreas
    }
}