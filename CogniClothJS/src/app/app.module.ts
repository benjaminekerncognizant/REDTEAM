import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { CategorylistComponent } from './categorylist/categorylist.component';
import { CartComponent } from './cart/cart.component';
import { AccountComponent } from './account/account.component';

@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    ProductlistComponent,
    CategorylistComponent,
    CartComponent,
    AccountComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
