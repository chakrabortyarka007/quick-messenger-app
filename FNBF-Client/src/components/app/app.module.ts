import { BrowserModule } from '@angular/platform-browser';
import { ModuleWithProviders,NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router'

import { AppComponent } from './app.component';
import { LoginComponent } from '../../components/login/login.component';


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
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }