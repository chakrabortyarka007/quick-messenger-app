import { BrowserModule } from '@angular/platform-browser';
import { ModuleWithProviders,NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule,Http,Response } from '@angular/http';
import { RouterModule } from '@angular/router';

import { NgFor } from '@angular/common';

import { AppComponent } from './app.component';
import { LoginComponent } from '../../components/login/login.component';
import { LoginUserDetails } from '../../services/login.component.services'


const rootRouting: ModuleWithProviders = RouterModule.forRoot([
    {
       path : '',
       component: LoginComponent
    }
],{useHash: true});

@NgModule({
  declarations: [
    AppComponent,LoginComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    rootRouting
  ],
  providers: [LoginUserDetails],
  bootstrap: [AppComponent]
})
export class AppModule { }