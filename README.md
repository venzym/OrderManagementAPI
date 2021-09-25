# OrderManagementAPI

## 프로젝트 목적

- `Grids & Circles` 카페의 커피 주문 관리 프로그램
    - 관리자 관리자 페이지를 통해 주문을 관리할 수 있다.
    - 고객은 주문 페이지를 통해 커피를 주문할 수 있다.

- 매일 전날 14:00 ~ 오늘 13:59 까지의 주문을 모아서 처리한다.

- email로 고객을 구분해 별도로 회원관리를 하지 않는다.

## 프로젝트 환경

- `Language` : Java 11
- `Framework` : Spring Boot
- `Database` : MySql
- `View` : Thymeleaf, React

## 기능 & 시스템 구성도

### 관리자

- 상품 조회
- 상품 등록
- (상품 갱신)
- (상품 삭제)

### 고객

- 상품 주문

### 프로젝트 구조
![Untitled Diagram drawio](https://user-images.githubusercontent.com/26544665/134765714-47cd28dc-bce4-4978-a05c-9bdad7f15e14.png)

### 시스템 구성도

- `configuration`
    - MvcConfiguration.java

- `controller`
    - ProductController.java
    - CreateProductRequest.java
    - CreateOrderRequest.java
    
    - `api`
        - OrderRestController.java
        - ProductRestController.java

- `model`
    - Category.java
    - Email.java
    - Order.java
    - OrderItem.java
    - OrderStatus.java
    - Product.java

- `repository`
    - JdbcUtils.java
    - OrderJdbcRepository.java
    - OrderRepository.java
    - ProductJdbcRepository.java
    - ProductRepository.java

- `service`
    - DefaultOrderService.java
    - DefaultProductService.java
    - OrderService.java
    - ProductService.java

- GcCoffeApplication.java

### 홈페이지
**관리자**
- 상품 조회
![image](https://user-images.githubusercontent.com/26544665/134765641-3c29a5e3-b485-426b-abb6-7544bce3a2c1.png)

- 상품 등록
![image](https://user-images.githubusercontent.com/26544665/134765657-86e5b3e1-44d5-47ca-b4d6-a7b6312a335b.png)


**고객**
- 상품 주문
![image](https://user-images.githubusercontent.com/26544665/134765687-a46c7a72-3887-49e3-a113-5d8a7d6cf5aa.png)


## 보완할 점

- 관리자 페이지에서 상품을 삽입, 삭제, 갱신하는 페이지를 추가해 구현해야 할 것 좋겠다. 현재는 너무 기능이 한정적이다.

- 고객도 단순히 상품 주문뿐만 아니라 장바구니 기능을 추가하는 등의 기능을 추가로 구현하면 좋을 것 같다.
