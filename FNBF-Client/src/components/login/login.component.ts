import {Component} from '@angular/core';
import { NgFor } from '@angular/common';
import {LoginUserDetails} from '../../services/login.component.services'

@Component({
    selector: 'login-app',
    templateUrl:  './login.component.html'
})
export class LoginComponent {
    
   userDetails = {};
   constructor(private user: LoginUserDetails){}
    
   ngOnInit(){
       this.getEmployee();
   }
    getEmployee() :void{
       this.userDetails = this.user.getUser();
        console.log(this.userDetails);
    }
}