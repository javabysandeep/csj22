package oops.anonymous;

public class TestProduct {
    public static void main(String[] args) {
        ProductService productService = new ProductService(){
            @Override
            public void createProduct() {
                System.out.println("product created");
            }
        };
        ProductService productService1 = new ProductService(){
            @Override
            public void createProduct() {
                System.out.println("product created1");
            }
        };
        productService.createProduct();
        productService1.createProduct();

        EpisodeService episodeService = new EpisodeService() {
            @Override
            public void createEpisode() {
                System.out.println("Episode created");
            }
        };
        episodeService.createEpisode();
    }
}
