import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ShopService } from 'src/app/services/shop.service';
import { IBrand, ICategory, IProduct } from 'src/app/model/product';
import { ProductItemComponent } from './product-item/product-item.component';
import { ShopParams } from 'src/app/model/shopparams';

@Component({
  selector: 'app-shop',
  standalone: true,
  imports: [CommonModule,ProductItemComponent],
  templateUrl: './shop.component.html',
  styleUrls: ['./shop.component.scss']
})
export class ShopComponent implements OnInit{

  products:IProduct[] = [];
  categories:ICategory[] = [];
  brands:IBrand[] = [];
  shopParams: ShopParams;

  constructor(private shopService:ShopService){
    this.shopParams = this.shopService.getShopParams();
  }

  ngOnInit(): void {
    this.getProducts();
    this.getCategories();
    this.getBrands();
  }


  getProducts(){
    this.shopService.getProducts().subscribe({
      next:response =>{
        if(response != null){
          this.products = response.dataList;
        }
      },
      error:error =>{
        console.log(error)
      }
    })
  }

  getCategories(){
    this.shopService.getCategories().subscribe({
      next:response =>{
        console.log(response)
        this.categories = [{categoryId:0, categoryName:'ALL'}, ...response];
      },
      error:error =>{
        console.log(error)
      }
    })
  }


  getBrands(){
    this.shopService.getBrands().subscribe({
      next:response =>{
        console.log(response)
        this.brands = [{brandId:0, brandName:'ALL'}, ...response];
      },
      error:error =>{
        console.log(error)
      }
    })
  }


  onBrandSelected(brandId: number){
    const params = this.shopService.getShopParams();
    params.brandId = brandId;
    this.shopService.setShopParams(params);
    this.shopParams = params;
    this.getProducts();
  }

  onCategorySelected(categoryId: number){
    const params = this.shopService.getShopParams();
    params.categoryId = categoryId;
    this.shopService.setShopParams(params);
    this.shopParams = params;
    this.getProducts();
  }



}
