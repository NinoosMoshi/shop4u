export interface IProduct {
  productId: number;
  sku: string;
  title: string;
  description: string;
  unitPrice: number;
  imageUrl: string;
  active:boolean;
  brandId: number;
  brandName: string;
  categoryId: number;
  categoryName: string;
  unitsInStock: number;
  dateCreated:Date;
  lastUpdated:Date;
}

export interface IBrand {
  brandId: number;
  brandName: string;
}

export interface ICategory {
  categoryId: number;
  categoryName: string;
}
