/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { ReservasServiceService } from './reservasService.service';

describe('Service: ReservasService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ReservasServiceService]
    });
  });

  it('should ...', inject([ReservasServiceService], (service: ReservasServiceService) => {
    expect(service).toBeTruthy();
  }));
});
