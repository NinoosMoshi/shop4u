import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { IPagination } from '../model/pagination';
import { IProduct } from '../model/product';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ShopService {

  constructor(private http:HttpClient) { }

  // http://localhost:8080/api/shop/products?pageSize=10
  getProducts() {
    // return this.http.get<IPagination<IProduct[]>>(environment.apiUrl +'shop/products?pageSize=10');
    return this.http.get<IPagination<IProduct[]>>(environment.apiUrl +'shop/products');
  }


}
