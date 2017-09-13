import { Injectable } from '@angular/core';
import {logindata} from '../interfaces/loginData';
import { userDetailsData } from '../stubs/loginJson'


@Injectable()
export class LoginUserDetails{
    
    constructor(){}
    getUser(): logindata[]{
        return userDetailsData;
    }
}