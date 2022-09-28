-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-09-2022 a las 21:16:28
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `library`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `books`
--

CREATE TABLE `books` (
  `id` int(11) NOT NULL,
  `title` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `edit` varchar(255) NOT NULL,
  `lang` varchar(255) NOT NULL,
  `pages` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `ejemplares` varchar(255) NOT NULL,
  `stock` int(11) NOT NULL,
  `available` int(11) NOT NULL,
  `borrado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `books`
--

INSERT INTO `books` (`id`, `title`, `date`, `author`, `category`, `edit`, `lang`, `pages`, `description`, `ejemplares`, `stock`, `available`, `borrado`) VALUES
(1, 'Cien años de soledad', '1987', 'Gabriel Garcia Marquez', 'Realismo mágico', '2da', 'Español', '347', 'Lindo libro, lindo lindo', '8', 3, 1, 0),
(2, 'Las Malas', '21-10-2019', 'Camila Sosa Villada', 'Realismo magico', '1', 'Español', '200', 'Librazo', '10', 10, 10, 0),
(3, 'Mi planta de naranja lima', '1987', 'Vasconcelos', 'Novela', ' 5', 'Español', '169', 'Vai a iora como un campion', 'ASs', 12, 8, 0),
(5, 'El anillo de diamantes', '11-11-1990', 'James Joyce', 'Poesía', '5ta', 'Español', '300', 'Poesia fea', '5', 5, 4, 0),
(6, 'El cavernicola desdentado', '1987', 'Pedro el Escamoso', 'Drama', '1', 'Español', '500', 'Harmoso libraco', 'asdasd', 10, 5, 0),
(7, 'El gato con botas', '1975', 'Antonio Banderas', 'Cuentos', '5ta', 'Español', '5', 'Cuento infantil', 'asd', 1, 3, 0),
(8, 'El quijote del manchón', '1875', 'El gallego', 'Clasicos', '1', 'Español', '259', 'Preocupado por la limpieza, don quijote se pone a lavar la ropa', 'sdae', 12, 11, 0),
(9, 'Condorito', '1999', 'Anonimo', 'Comic', '1', 'Español', '10', 'Comic Chileno', '1', 10, 10, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lendings`
--

CREATE TABLE `lendings` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `book_id` int(11) NOT NULL,
  `date_out` varchar(255) NOT NULL,
  `date_return` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `lendings`
--

INSERT INTO `lendings` (`id`, `user_id`, `book_id`, `date_out`, `date_return`) VALUES
(3, 3, 1, '21-09-2022', '26-09-2022'),
(4, 1, 4, '21-09-2022', '26-09-2022'),
(5, 1, 3, '21-09-2022', '26-09-2022'),
(6, 2, 3, '21-09-2022', '06-10-2022'),
(7, 4, 3, '21-09-2022', '06-10-2022'),
(8, 4, 8, '21-09-2022', '06-10-2022'),
(9, 6, 1, '25-09-2022', '10-10-2022'),
(10, 6, 5, '25-09-2022', '10-10-2022'),
(11, 6, 3, '25-09-2022', '10-10-2022'),
(12, 5, 3, '25-09-2022', '10-10-2022');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(32) NOT NULL,
  `name` varchar(30) NOT NULL,
  `last_name_p` varchar(30) NOT NULL,
  `last_name_m` varchar(30) NOT NULL,
  `domicilio` varchar(250) DEFAULT NULL,
  `tel` varchar(25) DEFAULT NULL,
  `sanctions` int(11) DEFAULT 0,
  `sanc_money` int(11) NOT NULL DEFAULT 0,
  `borrado` tinyint(4) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `name`, `last_name_p`, `last_name_m`, `domicilio`, `tel`, `sanctions`, `sanc_money`, `borrado`) VALUES
(1, 'usuario', '1234', 'Carolina', 'Bima', 'Ferreyra', 'Ayacucho 326', '3516565656', 0, 0, 0),
(2, 'MarielaLopez', '123456', 'Mariela', 'Lopez', 'Iriarte', 'Amigorena 345', '3516485298', 3, 210, 0),
(3, 'MariLo', 'Marilo3', 'Maria de los Angeles', 'Lopez', 'Heredia', 'San Juan 345', '3514578595', 0, 0, 0),
(4, 'PedroMex', 'clave123', 'Pedro', 'Páramo', 'Perez', 'Pereyra Iraola 2345', '35148759685', 0, 0, 0),
(5, 'MichaelJack', 'chirimoya', 'Michael', 'Pareyra', 'Perez', 'sarasa 2123', '1234567890', 0, 0, 0),
(6, 'CamilaLoca', 'canejo213', 'Camila', 'Velez', 'Velez', 'Caseros 321', '3516478958', 0, 0, 0),
(7, 'nombreusuario', 'contra', 'Pablo', 'ApellidoPadre', 'ApellidoMadre', 'Fake adress 123', '3516428652', 0, 0, 0),
(8, 'PedroMartinez', '123456789', 'Pedro', 'Martinez', 'Mejía', 'La rioja 3456', '351456789', 0, 0, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `lendings`
--
ALTER TABLE `lendings`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `books`
--
ALTER TABLE `books`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `lendings`
--
ALTER TABLE `lendings`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
