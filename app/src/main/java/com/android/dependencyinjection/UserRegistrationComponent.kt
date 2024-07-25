package com.android.dependencyinjection

import dagger.Component


// component hume object deta hai jo hume dagger se chaiye

// har ek required object ke liye ek function create krna hai for ex mereko userregistration wala chaiye
@Component
interface UserRegistrationComponent {


    // har ek required object ke liye ek function create krna hai for ex mereko userregistration wala chaiye
    fun getUserRegistrationService():UserRegistration

}