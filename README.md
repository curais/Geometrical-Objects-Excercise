# Geometrical-Objects-Excercise
This project represents geometrical objects implementing the `Shape` interface, here I implement three types of shapes:
- Triangles: The `Triangle` class allows the creation of every type of triangle, although Triangles cannot be created by their constructor, instead I provide the `TriangleFactory` class which allows to create triangles and also provides methods to creating various special-case triangles
- Quadrilaterals: Classes that extends the `AbstractQuadrilateral` behave as quadrilateral, meaning that their internal angles should sum `360`, quadrilaterals implemented are: Rectangle, Square, Rhombus, Rhomboid and Trapezoid
- N sides Polygons: Polygons with more than 4 sides are implemented with the `RegularNSidesShape`, which include general formulas for area calculation based on the apothem

Testinng is based on basic geometrical exercises 
