package pl.k480.logic.asteroid;

import java.lang.reflect.Array;

public class Asteroid {

    private AstTile[][] tiles = new AstTile[100][100];

    public void setTile(final AstTile tile, final int x, final int y) {
        tiles[x][y] = tile;
    }
}
