package lin.abcdq.avcache

import android.view.View
import androidx.fragment.app.FragmentActivity
import lin.abcdq.avcache.player2.ActivityCover

class MainActivityCover(context: FragmentActivity) : ActivityCover(context) {

    override fun onCreateView(): Int {
        return 0
    }

    override fun onViewCreated(view: View) {
    }

    override fun onResumed() {
    }

    override fun onPaused() {
    }

    override fun onStopped() {
    }

    override fun onDestroyed() {
    }

    override fun finish(): Boolean {
        return true
    }

}