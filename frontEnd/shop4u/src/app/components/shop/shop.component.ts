import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ShopService } from 'src/app/services/shop.service';
import { IProduct } from 'src/app/model/product';
import { ProductItemComponent } from './product-item/product-item.component';

@Component({
  selector: 'app-shop',
  standalone: true,
  imports: [CommonModule,ProductItemComponent],
  templateUrl: './shop.component.html',
  styleUrls: ['./shop.component.scss']
})
export class ShopComponent implements OnInit{

  products:IProduct[] = [];
  response:any;

  constructor(private shopService:ShopService){}

  ngOnInit(): void {
    this.shopService.getProducts().subscribe({
      next:response =>{
        this.products = response.dataList;
      },
      error:error =>{
        console.log(error)
      }
    })
  }




}
