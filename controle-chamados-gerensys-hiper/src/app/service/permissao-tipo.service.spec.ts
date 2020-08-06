import { TestBed } from '@angular/core/testing';

import { PermissaoTipoService } from './permissao-tipo.service';

describe('PermissaoTipoService', () => {
  let service: PermissaoTipoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PermissaoTipoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
