package com.rygital.garage.ui.base

interface MvpPresenter<in V: MvpView> {
    fun attachView(mvpView: V)
    fun detachView()
}