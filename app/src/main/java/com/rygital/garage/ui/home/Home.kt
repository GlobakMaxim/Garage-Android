package com.rygital.garage.ui.home

import com.rygital.garage.ui.base.MvpPresenter
import com.rygital.garage.ui.base.MvpView

interface Home {
    interface View: MvpView {

    }

    interface Presenter<in V: View>: MvpPresenter<V> {

    }
}