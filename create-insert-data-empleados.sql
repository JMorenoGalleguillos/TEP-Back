-- Table: public.empleados

-- DROP TABLE IF EXISTS public.empleados;

CREATE TABLE IF NOT EXISTS public.empleados
(
    id integer NOT NULL,
    email character varying(255) COLLATE pg_catalog."default",
    nombre_completo character varying(255) COLLATE pg_catalog."default",
    rut character varying(255) COLLATE pg_catalog."default",
    id_empresa integer,
    CONSTRAINT empleados_pkey PRIMARY KEY (id),
    CONSTRAINT fk3vpin99i90hobyqowv4pv0cpm FOREIGN KEY (id_empresa)
        REFERENCES public.empresas (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.empleados
    OWNER to postgres;
	
	
	
	
	-------------------------------
	
	
	INSERT INTO public.empleados(
	id, email, nombre_completo, rut, id_empresa)
	VALUES (?, ?, ?, ?, ?);
	
	
	-------------------------------
	
	
1,juan.perez@example.com,Juan Pérez,123456789,1
2,maria.rodriguez@example.com,María Rodríguez,987654321,1
3,pedro.gomez@example.com,Pedro Gómez,456789012,1
4,ana.garcia@example.com,Ana García,234567890,2
5,luisa.martinez@example.com,Luisa Martínez,876543210,2
6,carlos.sanchez@example.com,Carlos Sánchez,345678901,2
7,laura.diaz@example.com,Laura Díaz,210987654,3
8,miguel.lopez@example.com,Miguel López,789012345,3
9,isabel.fernandez@example.com,Isabel Fernández,567890123,3
10,ricardo.torres@example.com,Ricardo Torres,109876543,4