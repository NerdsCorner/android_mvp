package com.nerdscorner.mvplib.events.view

import android.app.Activity
import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.nerdscorner.mvplib.events.bus.Bus
import java.lang.ref.WeakReference

abstract class BaseFragmentView @JvmOverloads constructor(
        fragment: Fragment,
        @JvmField protected var bus: Bus = Bus.defaultBus
) : BaseView() {

    private var fragmentRef: WeakReference<Fragment> = WeakReference(fragment)

    override val activity: Activity?
        get() = fragmentRef.get()?.activity

    val fragmentManager: FragmentManager?
        get() {
            return fragmentRef.get()?.activity?.supportFragmentManager
        }

    val context: Context?
        get() = fragmentRef.get()?.context

    val fragment: Fragment?
        get() = fragmentRef.get()

    fun getActivity(): FragmentActivity? {
        return fragmentRef.get()?.activity
    }

    @JvmName("busSetter")
    fun setBus(bus: Bus) {
        this.bus = bus
    }
}
