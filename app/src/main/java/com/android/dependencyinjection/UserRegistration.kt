package com.android.dependencyinjection

class UserRegistration(val emailService: EmailService,
                       val userRepository: UserRepository
) {

    fun registerUser(email: String,password: String){
        userRepository.saveUser(email,password)
        emailService.sendEmail(email,"@akgec.ac.in","thank you for coming")
    }
}

/*
4 problems
       1->unit testing  {
       for unit testing user registration must have both class ready
       val emailService = EmailService()
    val userRepository=UserRepository()
       }
       2->single Responsibility
       3->Lifetime of these objects
       4->Extensible



     THEREFORE TO SOLVE THESE PROBLEMS WE MUST USE CONSTRUCTOR DEPENDENCY
 */