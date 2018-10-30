# Boardcad
Here I'll try to fix some boardcad features that're important to me.

BoardCAD is an easy to use(not really) CAD/CAM-program that allows you to quickly design your own surfboards. It is written in Java and can export STEP-files for compatibility with other CAD-systems, and g-code for CNC machines.

This repo is based on original boardcad source from sourceforge (commit r405)

# Fixed:
Export to DXF \ STL
Import from Shape3D (version v8 only). Please also note that it fails if you try to open a folder containing non V8 versions of *.s3d 