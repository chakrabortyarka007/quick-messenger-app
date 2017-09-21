import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import {Observable} from 'rxjs/Rx';
import 'rxjs/add/operator/map';
import {logindata} from '../interfaces/loginData';
import { userDetailsData } from '../stubs/loginJson'


@Injectable()
export class LoginUserDetails{
    
    constructor(private http: Http){}
    getUser() :Observable<logindata[]>{
//       return this.http.get('https://api.myjson.com/bins/17kx7x')
//                        .map(res => res.json());
        return this.http.get('/src/stubs/login.json')
                        .map(res => res.json());
    }
}