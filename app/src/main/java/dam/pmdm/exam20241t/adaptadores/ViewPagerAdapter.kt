package dam.pmdm.exam20241t.adaptadores

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import dam.pmdm.exam20241t.QuestionFragment


class ViewPagerAdapter (activity: AppCompatActivity, var itemsCount: Int) :
    FragmentStateAdapter(activity) {
    private val f1= QuestionFragment()

    override fun getItemCount(): Int {
        return itemsCount
    }

    override fun createFragment(position: Int): Fragment {

        return when(position) {
            0-> f1
            else -> QuestionFragment()
        }
    }

}