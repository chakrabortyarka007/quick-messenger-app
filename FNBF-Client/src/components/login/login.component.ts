import {Component} from '@angular/core';
import {LoginUserDetails} from '../../services/login.component.services'

@Component({
    selector: 'login-app',
    templateUrl:  './login.component.html'
})
export class LoginComponent {
   constructor(private user: LoginUserDetails){}
    
   ngOnInit(){
       this.getEmployee();
   }
    getEmployee() :any{
        this.user = this.user.getUser();
        console.log(this.user);
    }
}