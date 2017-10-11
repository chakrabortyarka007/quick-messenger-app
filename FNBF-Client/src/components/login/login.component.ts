import {Component} from '@angular/core';
import {LoginUserDetails} from '../../services/login.component.services';
import {Observable} from 'rxjs/Rx';

@Component({
    selector: 'login-app',
    styleUrls: ['./login.component.css'],
    templateUrl:  './login.component.html'
})
export class LoginComponent {
    
   userDetails = [];
   data = {};
   constructor(private user: LoginUserDetails){}
    
   ngOnInit(){
       this.getEmployee();
   }
    getEmployee() :any{
      return this.user.getUser().subscribe((value) => {
           this.userDetails = value
       },(error) => {
          console.log("Error happened");
      });
    }
}