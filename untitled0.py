import skimage.io as io
from numpy import float64
from numpy import uint8
import numpy as np


b = io.imread('blocks.jpg')
io.imshow(b)

bf = float64(b)

b1 = uint8(np.clip(bf*2,0,255))
b2 = uint8(np.clip(bf/2+128,0,255))

io.imshow(b1)
io.imshow(b2)

