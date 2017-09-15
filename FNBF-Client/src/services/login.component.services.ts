import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import 'rxjs/add/operator/map';
import {logindata} from '../interfaces/loginData';
import { userDetailsData } from '../stubs/loginJson'


@Injectable()
export class LoginUserDetails{
    
    constructor(private http: Http){}
    getUser(): any{
       this.http.get('/stubs/login.json').subscribe(data =>
           this.user = data
       )
       console.log(this.user);
    }
}