package com.nerdscorner.mvplib.testapp.events.attribute.fragments.presenter

import com.nerdscorner.mvplib.events.presenter.BaseFragmentPresenter
import com.nerdscorner.mvplib.testapp.events.attribute.fragments.model.Fragment2Model
import com.nerdscorner.mvplib.testapp.events.attribute.fragments.view.Fragment2View

import org.greenrobot.eventbus.NoSubscriberEvent
import org.greenrobot.eventbus.Subscribe

class Fragment2Presenter(view: Fragment2View, model: Fragment2Model) :
        BaseFragmentPresenter<Fragment2View, Fragment2Model>(view, model) {
    init {
        view.setText("Fragment 2")
    }

    @Subscribe
    fun onNoSubscribers(event: NoSubscriberEvent) {
    }
}
