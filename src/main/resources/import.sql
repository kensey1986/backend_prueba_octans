/* Populate tabla roles */
INSERT INTO roles (nombre) VALUES ('ADMINISTRADOR');
INSERT INTO roles (nombre) VALUES ('AUDITOR');
INSERT INTO roles (nombre) VALUES ('AUXILIAR');


/* Creamos algunos usuarios con sus roles */
INSERT INTO usuario (nombre, rol_id, create_at) VALUES ('pepe perez peraza', 1, '2018-03-05');
INSERT INTO usuario (nombre, rol_id, create_at) VALUES ('carlos cacecres', 2, '2018-03-06');
INSERT INTO usuario (nombre, rol_id, create_at) VALUES ('sofia contreras', 3, '2018-03-07');
INSERT INTO usuario (nombre, rol_id, create_at) VALUES ('carolina toloza', 1, '2018-03-08');


